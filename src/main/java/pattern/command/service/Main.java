package pattern.command.service;

public class Main {
    public static void main(String[] args) {
        // 创建灯对象
        Light light = new Light();

        // 创建命令对象，并将灯对象传递给命令对象
        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        // 创建遥控器对象，并设置命令
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);

        // 模拟按下按钮
        remoteControl.pressButton(); // 输出：Light is on

        // 切换命令
        remoteControl.setCommand(turnOffCommand);

        // 模拟按下按钮
        remoteControl.pressButton(); // 输出：Light is off
    }
}
