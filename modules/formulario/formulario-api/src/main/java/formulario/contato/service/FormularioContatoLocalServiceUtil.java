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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for FormularioContato. This utility wraps
 * <code>formulario.contato.service.impl.FormularioContatoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Eglen
 * @see FormularioContatoLocalService
 * @generated
 */
public class FormularioContatoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>formulario.contato.service.impl.FormularioContatoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the formulario contato to the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioContato the formulario contato
	 * @return the formulario contato that was added
	 */
	public static formulario.contato.model.FormularioContato
		addFormularioContato(
			formulario.contato.model.FormularioContato formularioContato) {

		return getService().addFormularioContato(formularioContato);
	}

	public static formulario.contato.model.FormularioContato
			addFormularioContato(
				long userId, String nome, String email, String estado,
				String municipio, String telefone, String mensagem,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addFormularioContato(
			userId, nome, email, estado, municipio, telefone, mensagem,
			serviceContext);
	}

	/**
	 * Creates a new formulario contato with the primary key. Does not add the formulario contato to the database.
	 *
	 * @param formularioId the primary key for the new formulario contato
	 * @return the new formulario contato
	 */
	public static formulario.contato.model.FormularioContato
		createFormularioContato(long formularioId) {

		return getService().createFormularioContato(formularioId);
	}

	/**
	 * Deletes the formulario contato from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioContato the formulario contato
	 * @return the formulario contato that was removed
	 */
	public static formulario.contato.model.FormularioContato
		deleteFormularioContato(
			formulario.contato.model.FormularioContato formularioContato) {

		return getService().deleteFormularioContato(formularioContato);
	}

	/**
	 * Deletes the formulario contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato that was removed
	 * @throws PortalException if a formulario contato with the primary key could not be found
	 */
	public static formulario.contato.model.FormularioContato
			deleteFormularioContato(long formularioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteFormularioContato(formularioId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static formulario.contato.model.FormularioContato
		fetchFormularioContato(long formularioId) {

		return getService().fetchFormularioContato(formularioId);
	}

	/**
	 * Returns the formulario contato matching the UUID and group.
	 *
	 * @param uuid the formulario contato's UUID
	 * @param groupId the primary key of the group
	 * @return the matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static formulario.contato.model.FormularioContato
		fetchFormularioContatoByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchFormularioContatoByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the formulario contato with the primary key.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato
	 * @throws PortalException if a formulario contato with the primary key could not be found
	 */
	public static formulario.contato.model.FormularioContato
			getFormularioContato(long formularioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFormularioContato(formularioId);
	}

	/**
	 * Returns the formulario contato matching the UUID and group.
	 *
	 * @param uuid the formulario contato's UUID
	 * @param groupId the primary key of the group
	 * @return the matching formulario contato
	 * @throws PortalException if a matching formulario contato could not be found
	 */
	public static formulario.contato.model.FormularioContato
			getFormularioContatoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFormularioContatoByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<formulario.contato.model.FormularioContato>
		getFormularioContatos(int start, int end) {

		return getService().getFormularioContatos(start, end);
	}

	/**
	 * Returns all the formulario contatos matching the UUID and company.
	 *
	 * @param uuid the UUID of the formulario contatos
	 * @param companyId the primary key of the company
	 * @return the matching formulario contatos, or an empty list if no matches were found
	 */
	public static java.util.List<formulario.contato.model.FormularioContato>
		getFormularioContatosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getFormularioContatosByUuidAndCompanyId(
			uuid, companyId);
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
	public static java.util.List<formulario.contato.model.FormularioContato>
		getFormularioContatosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<formulario.contato.model.FormularioContato>
					orderByComparator) {

		return getService().getFormularioContatosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of formulario contatos.
	 *
	 * @return the number of formulario contatos
	 */
	public static int getFormularioContatosCount() {
		return getService().getFormularioContatosCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the formulario contato in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param formularioContato the formulario contato
	 * @return the formulario contato that was updated
	 */
	public static formulario.contato.model.FormularioContato
		updateFormularioContato(
			formulario.contato.model.FormularioContato formularioContato) {

		return getService().updateFormularioContato(formularioContato);
	}

	public static FormularioContatoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<FormularioContatoLocalService, FormularioContatoLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			FormularioContatoLocalService.class);

		ServiceTracker
			<FormularioContatoLocalService, FormularioContatoLocalService>
				serviceTracker =
					new ServiceTracker
						<FormularioContatoLocalService,
						 FormularioContatoLocalService>(
							 bundle.getBundleContext(),
							 FormularioContatoLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}