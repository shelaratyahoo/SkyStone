package org.firstinspires.ftc.teamcode;

@Autonomus (name="Test")
public class Test extends LinearOpMode
{
HardwareRobot robot = new HardwareRobot()


 double power = 0.5;

@Override 
public void run0pMode()
{
robot.init(hardwareMap)
leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

drive(motorPower(0.4),1000);
drive(motorPower(0.2),300);
drive(motorPower(-0.3),1000);

waitForStart();
leftDrive.setPower(power);
rightDrive.setPower(-power);

}
public double motorPower(double speed) {
double power = 1*speed;
return power;
}



public void drive(double power, double time) {
robot.leftDrive.setPower(.5);
robot.rightDrive.setPower(-.5);
sleep(time);
}
