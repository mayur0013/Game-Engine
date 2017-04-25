/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 *
 * @author siddharth
 */
public class window {
    public static void creatWindow(int height,int width,String title)
    {
        Display.setTitle(title);
        try {
            
            Display.setDisplayMode(new DisplayMode(width,height));
            Display.create();        
            Keyboard.create();
            Mouse.create();
            
        } catch (LWJGLException ex) {
            Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void render()
    {
        Display.update();
    }
    
    public static void dispose()
    {
        Display.destroy();
        Keyboard.destroy();
        Mouse.destroy(); 
   }
    
    public static boolean isCloseRequested()
    {
        return Display.isCloseRequested();
    }
    
    public static int getWidth()
    {
        return Display.getDisplayMode().getWidth();        
    }
    
    public static int getHeight()
    {
        return Display.getDisplayMode().getHeight();        
    }
    
    public static String getTitle()
    {
        return Display.getTitle();
    }
}
