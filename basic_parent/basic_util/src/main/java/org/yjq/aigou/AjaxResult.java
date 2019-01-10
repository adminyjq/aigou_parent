package org.yjq.aigou;

public class AjaxResult {

    private Boolean success;
    private String message;
    private Object resultobj;

    public Object getResultobj() {
        return resultobj;
    }

    public AjaxResult setResultobj(Object resultobj) {
        this.resultobj = resultobj;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }
}
