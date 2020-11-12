<%@ include file="../init.jsp" %>

<portlet:renderURL var="addFormularioURL">
    <portlet:param name="mvcPath" value="/formulario/add_formulario.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
    <aui:button onClick="<%= addFormularioURL.toString() %>" value="Novo Contato"></aui:button>
</aui:button-row>