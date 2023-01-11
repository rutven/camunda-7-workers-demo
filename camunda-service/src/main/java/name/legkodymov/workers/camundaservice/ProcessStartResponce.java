package name.legkodymov.workers.camundaservice;

import java.io.Serializable;

public class ProcessStartResponce implements Serializable {
    private String instanceId;

    public ProcessStartResponce(String id) {
        this.instanceId = id;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}
