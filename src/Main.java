import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import org.william.StartClicker;
import org.william.frame.MyFrame;
import org.william.label.MyLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.InputEvent;
import java.lang.annotation.Native;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener {
    StartClicker startClicker = new StartClicker();
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_SPACE) {
            System.out.println("Break");
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException nativeHookException) {
                nativeHookException.printStackTrace();
            }
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_A) {
            try {
                startClicker.clicker(1);
            } catch (AWTException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_L) {
            try {
                startClicker.clicker(2);
            } catch (AWTException ex) {
                throw new RuntimeException(ex);
            }
        }
    }


    public static void main(String[] args) {
        MyLabel myLabel = new MyLabel();
        MyFrame myFrame = new MyFrame(myLabel);

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.out.println(ex.getMessage());
        }
        GlobalScreen.addNativeKeyListener(new Main());
    }
}