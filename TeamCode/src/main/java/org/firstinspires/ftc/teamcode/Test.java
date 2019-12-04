package org.firstinspires.ftc.teamcode;

@Autonomus (name="Test")
public class Test extends LinearOpMode
{
 private DcMotor leftDrive, rightDrive;
 double power = 0.5;

@Override 
public void run0pMode()
{
leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

waitForStart();
leftDrive.setPower(power);
rightDrive.setPower(-power);

}

}
