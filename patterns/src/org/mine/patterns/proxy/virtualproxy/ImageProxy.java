//package org.mine.patterns.proxy.virtualproxy;
//
//import javax.swing.*;
//import java.awt.*;
//import java.net.URL;
//
///**
// * @ClassName ImageProxy
// * @Description
// * @Author Administrator
// * @Date 2021/4/6 0006 20:22
// * @Version 1.0
// */
//public class ImageProxy implements Icon {
//    private ImageIcon imageIcon;
//    private URL imageURL;
//    private Thread retrievalThread;
//    private boolean retrievaling;
//
//    public ImageProxy(String imageURL) {
//        this.imageURL = imageURL;
//    }
//
//    @Override
//    public void paintIcon(Component c, Graphics g, int x, int y) {
//        if (imageIcon != null) {
//            imageIcon.paintIcon(c, g, x, y);
//        }else {
//            g.drawString("Loading CD cover,please wait...",x + 30, y + 190);
//            if (!retrievaling) {
//                retrievaling = true;
//                retrievalThread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            imageIcon = new ImageIcon(imageURL,"CD Cover");
//                            c.repaint();
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                });
//                retrievalThread.start();
//            }
//        }
//    }
//
//    @Override
//    public int getIconWidth() {
//        if (imageIcon != null) {
//            return imageIcon.getIconWidth();
//        }else {
//            return 800;
//        }
//    }
//
//    @Override
//    public int getIconHeight() {
//        if (imageIcon != null) {
//            return imageIcon.getIconHeight();
//        }else {
//            return 600;
//        }
//    }
//}
