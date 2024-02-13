package pkgs.mbs;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class MyBean {

    //Componentes para Binding
    private HtmlInputText inputComponent;
    private HtmlOutputText outputComponent;

    //Armazena valores dos componentes
    private String inputValue;
    private String outputValue;

    public MyBean() {
        log("constructed");
    }

    public void action() {
        outputValue = inputValue;
        log("succes");
    }

    public HtmlInputText getInputComponent() {
        log(inputComponent);
        return inputComponent;
    }

    public String getInputValue() {
        log(inputValue);
        return inputValue;
    }

    public HtmlOutputText getOutputComponent() {
        log(outputComponent);
        return outputComponent;
    }

    public String getOutputValue() {
        log(outputValue);
        return outputValue;
    }

    public void setInputComponent(HtmlInputText inputComponent) {
        log(inputComponent);
        this.inputComponent = inputComponent;
    }

    public void setInputValue(String inputValue) {
        log(inputValue);
        this.inputValue = inputValue;
    }

    public void setOutputComponent(HtmlOutputText outputComponent) {
        log(outputComponent);
        this.outputComponent = outputComponent;
    }

      //Escuta por alterações do inputText e escreve no console quando houver
    public void inputChanged(ValueChangeEvent event) {
        log(event.getOldValue() + " to " + event.getNewValue());
    }

    //Escreve um LOG no console, para acompanharmos o ciclo de vida
    private void log(Object object) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("MyBean " + methodName + ": " + object);
    }
}
