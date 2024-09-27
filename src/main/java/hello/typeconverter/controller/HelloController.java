package hello.typeconverter.controller;

import hello.typeconverter.type.IpPort;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/helloV1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);
        return "ok";
    }
    @GetMapping("/helloV2")
    public String helloV2(@RequestParam(name = "data") Integer data) {
        System.out.println("intValue = " + data);
        return "ok";
    }
    @GetMapping("/ip-port")
    public String helloV3(@RequestParam(name = "ipPort") IpPort ipPort) {
        System.out.println("ipPort = " + ipPort);
        System.out.println("ipPort.ip = " + ipPort.getIp());
        System.out.println("ipPort.port = " + ipPort.getPort());
        return "ok";
    }
}
