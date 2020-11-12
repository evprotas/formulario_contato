<%@ include file="../init.jsp" %>

<% 

FormularioContato formulario = null;

%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/formulario/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addFormulario" var="addFormularioURL" />

<aui:form action="<%= addFormularioURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= formulario %>" model="<%= FormularioContato.class %>" />

	<aui:fieldset>

		<aui:input name="nome" />
		<aui:input name="email" />
		<aui:input name="estado" />
		<aui:input name="cidade" />
		<aui:input name="telefone" />
		<aui:input name="mensagem" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>