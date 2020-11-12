/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package formulario.contato.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.osgi.service.component.annotations.Component;

import formulario.contato.exception.FormularioEmailException;
import formulario.contato.exception.FormularioMensagemException;
import formulario.contato.exception.FormularioNomeException;
import formulario.contato.exception.FormularioTelefoneException;
import formulario.contato.model.FormularioContato;
import formulario.contato.service.base.FormularioContatoLocalServiceBaseImpl;

/**
 * The implementation of the formulario contato local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>formulario.contato.service.FormularioContatoLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Eglen
 * @see FormularioContatoLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=formulario.contato.model.FormularioContato",
	service = AopService.class
)
public class FormularioContatoLocalServiceImpl
	extends FormularioContatoLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>formulario.contato.service.FormularioContatoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>formulario.contato.service.FormularioContatoLocalServiceUtil</code>.
	 */
	public FormularioContato addFormularioContato(long userId, String nome, 
			String email, String estado, String municipio, String telefone,
			String mensagem, ServiceContext serviceContext)
		throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(nome, email, estado, municipio, telefone, mensagem);

		DateFormat dateFormat = new SimpleDateFormat("yyyymmdd");  
        String strDate = dateFormat.format(now);
		
		String protocolo = strDate + telefone;
		
		long formularioId = counterLocalService.increment();

		FormularioContato formulario = formularioContatoPersistence.create(formularioId);

		formulario.setUuid(serviceContext.getUuid());
		formulario.setUserId(userId);
		formulario.setGroupId(groupId);
		formulario.setCompanyId(user.getCompanyId());
		formulario.setUserName(user.getFullName());
		formulario.setCreateDate(serviceContext.getCreateDate(now));
		formulario.setModifiedDate(serviceContext.getModifiedDate(now));
		formulario.setExpandoBridgeAttributes(serviceContext);
		formulario.setNome(nome);
		formulario.setEmail(email);
		formulario.setMensagem(mensagem);
		formulario.setProtocolo(protocolo);

		formularioContatoPersistence.update(formulario);

		// Calls to other Liferay frameworks go here

		return formulario;
	}
	
	protected void validate(String nome, String email, String estado, 
			String municipio, String telefone, String mensagem)
			throws PortalException {

			if (Validator.isNull(nome)) {
				throw new FormularioNomeException();
			}

			if (!Validator.isEmailAddress(email)) {
				throw new FormularioEmailException();
			}
			
			if (Validator.isDigit(telefone)) {
				throw new FormularioTelefoneException();
			}

			if (Validator.isNull(mensagem)) {
				throw new FormularioMensagemException();
			}
		}
}