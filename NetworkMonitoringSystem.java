package Assignment;
/*5.	Design and implement a Java program that simulates a network monitoring system. 
Your system should be capable of monitoring different types of network devices, such as routers and switches, 
and alerting if any devices are experiencing errors or downtime. 
Use interfaces to define common behaviors for network devices and implement these behaviors in different device classes.
Create an interface named NetworkDevice with at least two methods:
 	getStatus() which returns a String indicating the current status of the device  
    isAvailable() which returns a boolean indicating if the device is currently available and functioning correctly.
Implement the NetworkDevice interface in at least three separate classes, Router and Switch. 
Each class should have a constructor that sets specific properties for the device and specific logic to determine its status and availability.*/


interface NetworkDevice {
    String getStatus();
    boolean isAvailable();
    String getID();
}

class Router implements NetworkDevice {
    private String status;
    private String RouterID;

    Router(String status, String RouterID){
        this.status=status;
        this.RouterID=RouterID;
    }
    public String getID(){
        return RouterID;
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override 
    public boolean isAvailable(){
        return status.equals("on");
    }
}

class Switch implements NetworkDevice{
    private String status;
    private String SwitchID;

    Switch(String status, String SwitchID){
        this.status=status;
        this.SwitchID=SwitchID;
    }
    public String getID(){
        return SwitchID;
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override 
    public boolean isAvailable(){
        return status.equals("on");
    }
}

class Hub implements NetworkDevice {
    private String status;
    private String HubID;

    Hub(String status, String HubID){
        this.status=status;
        this.HubID=HubID;
    }
    public String getID(){
        return HubID;
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override 
    public boolean isAvailable(){
        return status.equals("on");
    }
}

public class NetworkMonitoringSystem {
    public void DeviceStatus(NetworkDevice device){
        if(device.isAvailable()){
            System.out.println(device.getID()+" is running..");
        } else {
            System.out.println(device.getID() + " is encountering issues");
        }
    }
    
    public static void main(String[] args) {
        NetworkDevice router1 = new Router("on", "XXX-XXX-XXX");
        NetworkDevice switch1 = new Switch("on", "XXX-XXX-XXX");
        NetworkDevice hub1 = new Hub("off", "XXX-XXX-XXX");

        NetworkMonitoringSystem nms = new NetworkMonitoringSystem();
        nms.DeviceStatus(router1);
        nms.DeviceStatus(switch1);
        nms.DeviceStatus(hub1);
    }
}
 
