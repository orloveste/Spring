package myApp.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetDI {
    @Autowired
    private InjectionDI injectionDI;

    private InjectionDI2 injectionDI2;

    @Autowired
    public TargetDI(InjectionDI2 injectionDI2) {
        this.injectionDI2 = injectionDI2;
    }
    private InjectionDI3 injectionDI3;

    @Autowired
    public void setInjectionDI3(InjectionDI3 injectionDI3) {
        this.injectionDI3 = injectionDI3;
    }
}
