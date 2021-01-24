package valami.miracle.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModGuiLotsOfButtons extends Screen {
    private static final Logger LOGGER = LogManager.getLogger();
    private static Button[] btns = new Button[25];

    protected ModGuiLotsOfButtons(ITextComponent titleIn)
    {
        super(titleIn);
    }

    protected static void write(String s)
    {
        LOGGER.info("BUTTON PRESSED >> {}", s);
    }

    @Override
    protected void init() {
        this.minecraft.keyboardListener.enableRepeatEvents(true);

        for(int a = 0; a < 5; a++)
        {
            for(int b = 0; b < 5; b++)
            {
                ITextComponent szoveg = new StringTextComponent(a + "x" + b);
                Button btn = new Button(a * (this.width / 5),b*(this.height/5),this.width / 5,this.height/5,szoveg,(button) -> {write(szoveg.getString());});
                this.children.add(btn);
                btns[(a * 5) + b] = btn;
            }
        }

        super.init();
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        //this.minecraft.getTextureManager().bindTexture(new ResourceLocation(mod_id,path));
        int textureWidth = 400;
        int textureHeight = 200;
        blit(matrixStack, this.width / 2 - 150, 10, 0, 0, 400, 200, textureWidth, textureHeight);

        for(int a = 0; a < btns.length; a++)
        {
            btns[a].render(matrixStack, mouseX, mouseY, partialTicks);
        }
        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }
}
