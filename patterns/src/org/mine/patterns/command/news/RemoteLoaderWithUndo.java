package org.mine.patterns.command.news;

import org.mine.patterns.command.news.impl.LightOffCommand;
import org.mine.patterns.command.news.impl.LightOnCommand;

/**
 * @ClassName RemoteLoaderWithUndo
 * @Description
 * @Author Administrator
 * @Date 2021/3/28 0028 19:07
 * @Version 1.0
 */
public class RemoteLoaderWithUndo {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(7);
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLigthOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLigthOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
