import org.william.StartClicker;
import org.william.frame.MyFrame;
import org.william.label.MyLabel;

import java.awt.*;
import java.awt.event.KeyEvent;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener {
    private Thread clickerThread;
    static StartClicker startClicker = new StartClicker();
    public void nativeKeyPressed(NativeKeyEvent e) {
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_1) {
                clickerThread = new Thread(() -> {
                    try {
                        startClicker.clicker();
                    } catch (AWTException ex) {
                        throw new RuntimeException(ex);
                    }
                });
                clickerThread.start();
            } else if (e.getKeyChar() == KeyEvent.VK_2) {
                clickerThread.interrupt();
                }
            }

    public static void main(String[] args) {
        MyLabel myLabel = new MyLabel();
        MyFrame myFrame = new MyFrame(myLabel, startClicker);

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.out.println(ex.getMessage());
        }
        GlobalScreen.addNativeKeyListener(new Main());
    }
}