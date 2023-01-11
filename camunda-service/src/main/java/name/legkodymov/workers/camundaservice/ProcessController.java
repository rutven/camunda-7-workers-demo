package name.legkodymov.workers.camundaservice;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableProcessApplication
@RestController
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping(path = "/api/start", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProcessStartResponce startProcess() {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("demo-process");
        return new ProcessStartResponce(instance.getId());
    }
}
