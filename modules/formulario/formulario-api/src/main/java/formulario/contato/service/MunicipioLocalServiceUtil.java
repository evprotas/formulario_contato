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
 * Provides the local service utility for Municipio. This utility wraps
 * <code>formulario.contato.service.impl.MunicipioLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Eglen
 * @see MunicipioLocalService
 * @generated
 */
public class MunicipioLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>formulario.contato.service.impl.MunicipioLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the municipio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was added
	 */
	public static formulario.contato.model.Municipio addMunicipio(
		formulario.contato.model.Municipio municipio) {

		return getService().addMunicipio(municipio);
	}

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param municipioId the primary key for the new municipio
	 * @return the new municipio
	 */
	public static formulario.contato.model.Municipio createMunicipio(
		long municipioId) {

		return getService().createMunicipio(municipioId);
	}

	/**
	 * Deletes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws PortalException if a municipio with the primary key could not be found
	 */
	public static formulario.contato.model.Municipio deleteMunicipio(
			long municipioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteMunicipio(municipioId);
	}

	/**
	 * Deletes the municipio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was removed
	 */
	public static formulario.contato.model.Municipio deleteMunicipio(
		formulario.contato.model.Municipio municipio) {

		return getService().deleteMunicipio(municipio);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.MunicipioModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.MunicipioModelImpl</code>.
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

	public static formulario.contato.model.Municipio fetchMunicipio(
		long municipioId) {

		return getService().fetchMunicipio(municipioId);
	}

	/**
	 * Returns the municipio matching the UUID and group.
	 *
	 * @param uuid the municipio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static formulario.contato.model.Municipio
		fetchMunicipioByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchMunicipioByUuidAndGroupId(uuid, groupId);
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

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the municipio with the primary key.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio
	 * @throws PortalException if a municipio with the primary key could not be found
	 */
	public static formulario.contato.model.Municipio getMunicipio(
			long municipioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getMunicipio(municipioId);
	}

	/**
	 * Returns the municipio matching the UUID and group.
	 *
	 * @param uuid the municipio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching municipio
	 * @throws PortalException if a matching municipio could not be found
	 */
	public static formulario.contato.model.Municipio
			getMunicipioByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getMunicipioByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of municipios
	 */
	public static java.util.List<formulario.contato.model.Municipio>
		getMunicipios(int start, int end) {

		return getService().getMunicipios(start, end);
	}

	/**
	 * Returns all the municipios matching the UUID and company.
	 *
	 * @param uuid the UUID of the municipios
	 * @param companyId the primary key of the company
	 * @return the matching municipios, or an empty list if no matches were found
	 */
	public static java.util.List<formulario.contato.model.Municipio>
		getMunicipiosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getMunicipiosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of municipios matching the UUID and company.
	 *
	 * @param uuid the UUID of the municipios
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching municipios, or an empty list if no matches were found
	 */
	public static java.util.List<formulario.contato.model.Municipio>
		getMunicipiosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<formulario.contato.model.Municipio> orderByComparator) {

		return getService().getMunicipiosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 */
	public static int getMunicipiosCount() {
		return getService().getMunicipiosCount();
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
	 * Updates the municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was updated
	 */
	public static formulario.contato.model.Municipio updateMunicipio(
		formulario.contato.model.Municipio municipio) {

		return getService().updateMunicipio(municipio);
	}

	public static MunicipioLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MunicipioLocalService, MunicipioLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MunicipioLocalService.class);

		ServiceTracker<MunicipioLocalService, MunicipioLocalService>
			serviceTracker =
				new ServiceTracker
					<MunicipioLocalService, MunicipioLocalService>(
						bundle.getBundleContext(), MunicipioLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}