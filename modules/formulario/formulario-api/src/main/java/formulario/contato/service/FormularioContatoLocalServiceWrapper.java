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

package formulario.contato.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FormularioContatoLocalService}.
 *
 * @author Eglen
 * @see FormularioContatoLocalService
 * @generated
 */
public class FormularioContatoLocalServiceWrapper
	implements FormularioContatoLocalService,
			   ServiceWrapper<FormularioContatoLocalService> {

	public FormularioContatoLocalServiceWrapper(
		FormularioContatoLocalService formularioContatoLocalService) {

		_formularioContatoLocalService = formularioContatoLocalService;
	}

	/**
	 * Adds the formulario contato to the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioContato the formulario contato
	 * @return the formulario contato that was added
	 */
	@Override
	public formulario.contato.model.FormularioContato addFormularioContato(
		formulario.contato.model.FormularioContato formularioContato) {

		return _formularioContatoLocalService.addFormularioContato(
			formularioContato);
	}

	@Override
	public formulario.contato.model.FormularioContato addFormularioContato(
			long userId, String nome, String email, String estado,
			String municipio, String telefone, String mensagem,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formularioContatoLocalService.addFormularioContato(
			userId, nome, email, estado, municipio, telefone, mensagem,
			serviceContext);
	}

	/**
	 * Creates a new formulario contato with the primary key. Does not add the formulario contato to the database.
	 *
	 * @param formularioId the primary key for the new formulario contato
	 * @return the new formulario contato
	 */
	@Override
	public formulario.contato.model.FormularioContato createFormularioContato(
		long formularioId) {

		return _formularioContatoLocalService.createFormularioContato(
			formularioId);
	}

	/**
	 * Deletes the formulario contato from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioContato the formulario contato
	 * @return the formulario contato that was removed
	 */
	@Override
	public formulario.contato.model.FormularioContato deleteFormularioContato(
		formulario.contato.model.FormularioContato formularioContato) {

		return _formularioContatoLocalService.deleteFormularioContato(
			formularioContato);
	}

	/**
	 * Deletes the formulario contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato that was removed
	 * @throws PortalException if a formulario contato with the primary key could not be found
	 */
	@Override
	public formulario.contato.model.FormularioContato deleteFormularioContato(
			long formularioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formularioContatoLocalService.deleteFormularioContato(
			formularioId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formularioContatoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _formularioContatoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formularioContatoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _formularioContatoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _formularioContatoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _formularioContatoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _formularioContatoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public formulario.contato.model.FormularioContato fetchFormularioContato(
		long formularioId) {

		return _formularioContatoLocalService.fetchFormularioContato(
			formularioId);
	}

	/**
	 * Returns the formulario contato matching the UUID and group.
	 *
	 * @param uuid the formulario contato's UUID
	 * @param groupId the primary key of the group
	 * @return the matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	@Override
	public formulario.contato.model.FormularioContato
		fetchFormularioContatoByUuidAndGroupId(String uuid, long groupId) {

		return _formularioContatoLocalService.
			fetchFormularioContatoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _formularioContatoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _formularioContatoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the formulario contato with the primary key.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato
	 * @throws PortalException if a formulario contato with the primary key could not be found
	 */
	@Override
	public formulario.contato.model.FormularioContato getFormularioContato(
			long formularioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formularioContatoLocalService.getFormularioContato(
			formularioId);
	}

	/**
	 * Returns the formulario contato matching the UUID and group.
	 *
	 * @param uuid the formulario contato's UUID
	 * @param groupId the primary key of the group
	 * @return the matching formulario contato
	 * @throws PortalException if a matching formulario contato could not be found
	 */
	@Override
	public formulario.contato.model.FormularioContato
			getFormularioContatoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formularioContatoLocalService.
			getFormularioContatoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the formulario contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @return the range of formulario contatos
	 */
	@Override
	public java.util.List<formulario.contato.model.FormularioContato>
		getFormularioContatos(int start, int end) {

		return _formularioContatoLocalService.getFormularioContatos(start, end);
	}

	/**
	 * Returns all the formulario contatos matching the UUID and company.
	 *
	 * @param uuid the UUID of the formulario contatos
	 * @param companyId the primary key of the company
	 * @return the matching formulario contatos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<formulario.contato.model.FormularioContato>
		getFormularioContatosByUuidAndCompanyId(String uuid, long companyId) {

		return _formularioContatoLocalService.
			getFormularioContatosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of formulario contatos matching the UUID and company.
	 *
	 * @param uuid the UUID of the formulario contatos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching formulario contatos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<formulario.contato.model.FormularioContato>
		getFormularioContatosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<formulario.contato.model.FormularioContato>
					orderByComparator) {

		return _formularioContatoLocalService.
			getFormularioContatosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of formulario contatos.
	 *
	 * @return the number of formulario contatos
	 */
	@Override
	public int getFormularioContatosCount() {
		return _formularioContatoLocalService.getFormularioContatosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _formularioContatoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _formularioContatoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _formularioContatoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the formulario contato in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param formularioContato the formulario contato
	 * @return the formulario contato that was updated
	 */
	@Override
	public formulario.contato.model.FormularioContato updateFormularioContato(
		formulario.contato.model.FormularioContato formularioContato) {

		return _formularioContatoLocalService.updateFormularioContato(
			formularioContato);
	}

	@Override
	public FormularioContatoLocalService getWrappedService() {
		return _formularioContatoLocalService;
	}

	@Override
	public void setWrappedService(
		FormularioContatoLocalService formularioContatoLocalService) {

		_formularioContatoLocalService = formularioContatoLocalService;
	}

	private FormularioContatoLocalService _formularioContatoLocalService;

}