package br.com.chronos.Academy.appium;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTest {
    DriverFactory driverFactory;
    String resultado;

    @BeforeEach
    public void inicializaDriver()throws MalformedURLException{
        driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosMobile", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
    }

    @AfterEach
    public void finalizaDriver(){
        driverFactory.getDriver().quit();
    }

    public void clickId(String id){
        driverFactory.getDriver().findElement(MobileBy.id(id)).click();
    }

    public void getTexto(String result){
        resultado = driverFactory.getDriver().findElement(MobileBy.id(result)).getText();
    }



    @Test
    public void validaMultiplicacao(){
        clickId("digit_7");
        clickId("op_mul");
        clickId("digit_9");
        clickId("eq");
        getTexto("result");
        assertEquals("63", resultado);

    }

    @Test
    public void validaDivisao() throws MalformedURLException {
        clickId("digit_8");
        clickId("op_div");
        clickId("digit_4");
        clickId("eq");
        getTexto("result");
        assertEquals("2", resultado);

    }

    @Test
    public void validaAdicao() throws MalformedURLException {
        clickId("digit_6");
        clickId("op_add");
        clickId("digit_5");
        clickId("eq");
        getTexto("result");
        assertEquals("11", resultado);

    }

    @Test
    public void validaSubtracao() throws MalformedURLException {
        clickId("digit_3");
        clickId("op_sub");
        clickId("digit_2");
        clickId("eq");
        getTexto("result");
        assertEquals("1", resultado);

    }
}
