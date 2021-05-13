var json = S(response);
var resp = json.elements();
var respInfo = resp.get(0);
var status = respInfo.prop("Status").value();
print("PostCode check status: "+status);

var execution = connector.getParentVariableScope();
execution.setVariable("status",status);