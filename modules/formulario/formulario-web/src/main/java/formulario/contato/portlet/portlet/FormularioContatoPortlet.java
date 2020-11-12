package formulario.contato.portlet.portlet;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import formulario.contato.model.FormularioContato;
import formulario.contato.portlet.constants.FormularioContatoPortletKeys;
import formulario.contato.service.FormularioContatoLocalService;

/**
 * @author eglen
 */
@Component(
	    immediate = true,
	    property = {
	      "com.liferay.portlet.display-category=category.social",
	      "com.liferay.portlet.instanceable=false",
	      "com.liferay.portlet.scopeable=true",
	      "javax.portlet.display-name=Formulario",
	      "javax.portlet.expiration-cache=0",
	      "javax.portlet.init-param.template-path=/",
	      "javax.portlet.init-param.view-template=/formulario/view.jsp",
	      "javax.portlet.resource-bundle=content.Language",
	      "javax.portlet.security-role-ref=power-user,user",
	      "javax.portlet.supports.mime-type=text/html",
	      "javax.portlet.name=" + FormularioContatoPortletKeys.FORMULARIOCONTATO	    },
	    service = Portlet.class
	)
public class FormularioContatoPortlet extends MVCPortlet {
	@Reference
	private FormularioContatoLocalService _formularioContatoLocalService;
	
	public void addFormulario(ActionRequest request, ActionResponse response)
            throws PortalException {

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
            FormularioContato.class.getName(), request);

        String nome = ParamUtil.getString(request, "nome");
        String email = ParamUtil.getString(request, "email");
        String estado = ParamUtil.getString(request, "estado");
        String cidade = ParamUtil.getString(request, "cidade");
        String telefone = ParamUtil.getString(request, "telefone");
        String mensagem = ParamUtil.getString(request, "mensagem");

        try {
            _formularioContatoLocalService.addFormularioContato(
                serviceContext.getUserId(), nome, email, estado, cidade, telefone,
                mensagem, serviceContext);

        }
        catch (Exception e) {
            System.out.println(e);

            PortalUtil.copyRequestParameters(request, response);

            response.setRenderParameter(
                "mvcPath", "/formulario/add_formulario.jsp");
        }
    
}
}
