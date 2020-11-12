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
 * Provides a wrapper for {@link MunicipioLocalService}.
 *
 * @author Eglen
 * @see MunicipioLocalService
 * @generated
 */
public class MunicipioLocalServiceWrapper
	implements MunicipioLocalService, ServiceWrapper<MunicipioLocalService> {

	public MunicipioLocalServiceWrapper(
		MunicipioLocalService municipioLocalService) {

		_municipioLocalService = municipioLocalService;
	}

	/**
	 * Adds the municipio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was added
	 */
	@Override
	public formulario.contato.model.Municipio addMunicipio(
		formulario.contato.model.Municipio municipio) {

		return _municipioLocalService.addMunicipio(municipio);
	}

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param municipioId the primary key for the new municipio
	 * @return the new municipio
	 */
	@Override
	public formulario.contato.model.Municipio createMunicipio(
		long municipioId) {

		return _municipioLocalService.createMunicipio(municipioId);
	}

	/**
	 * Deletes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws PortalException if a municipio with the primary key could not be found
	 */
	@Override
	public formulario.contato.model.Municipio deleteMunicipio(long municipioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _municipioLocalService.deleteMunicipio(municipioId);
	}

	/**
	 * Deletes the municipio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was removed
	 */
	@Override
	public formulario.contato.model.Municipio deleteMunicipio(
		formulario.contato.model.Municipio municipio) {

		return _municipioLocalService.deleteMunicipio(municipio);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _municipioLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _municipioLocalService.dynamicQuery();
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

		return _municipioLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _municipioLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _municipioLocalService.dynamicQuery(
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

		return _municipioLocalService.dynamicQueryCount(dynamicQuery);
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

		return _municipioLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public formulario.contato.model.Municipio fetchMunicipio(long municipioId) {
		return _municipioLocalService.fetchMunicipio(municipioId);
	}

	/**
	 * Returns the municipio matching the UUID and group.
	 *
	 * @param uuid the municipio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	@Override
	public formulario.contato.model.Municipio fetchMunicipioByUuidAndGroupId(
		String uuid, long groupId) {

		return _municipioLocalService.fetchMunicipioByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _municipioLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _municipioLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _municipioLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the municipio with the primary key.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio
	 * @throws PortalException if a municipio with the primary key could not be found
	 */
	@Override
	public formulario.contato.model.Municipio getMunicipio(long municipioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _municipioLocalService.getMunicipio(municipioId);
	}

	/**
	 * Returns the municipio matching the UUID and group.
	 *
	 * @param uuid the municipio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching municipio
	 * @throws PortalException if a matching municipio could not be found
	 */
	@Override
	public formulario.contato.model.Municipio getMunicipioByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _municipioLocalService.getMunicipioByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<formulario.contato.model.Municipio> getMunicipios(
		int start, int end) {

		return _municipioLocalService.getMunicipios(start, end);
	}

	/**
	 * Returns all the municipios matching the UUID and company.
	 *
	 * @param uuid the UUID of the municipios
	 * @param companyId the primary key of the company
	 * @return the matching municipios, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<formulario.contato.model.Municipio>
		getMunicipiosByUuidAndCompanyId(String uuid, long companyId) {

		return _municipioLocalService.getMunicipiosByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<formulario.contato.model.Municipio>
		getMunicipiosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<formulario.contato.model.Municipio> orderByComparator) {

		return _municipioLocalService.getMunicipiosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 */
	@Override
	public int getMunicipiosCount() {
		return _municipioLocalService.getMunicipiosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _municipioLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _municipioLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was updated
	 */
	@Override
	public formulario.contato.model.Municipio updateMunicipio(
		formulario.contato.model.Municipio municipio) {

		return _municipioLocalService.updateMunicipio(municipio);
	}

	@Override
	public MunicipioLocalService getWrappedService() {
		return _municipioLocalService;
	}

	@Override
	public void setWrappedService(MunicipioLocalService municipioLocalService) {
		_municipioLocalService = municipioLocalService;
	}

	private MunicipioLocalService _municipioLocalService;

}