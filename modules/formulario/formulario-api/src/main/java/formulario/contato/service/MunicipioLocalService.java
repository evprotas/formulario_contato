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

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import formulario.contato.model.Municipio;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Municipio. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Eglen
 * @see MunicipioLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MunicipioLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MunicipioLocalServiceUtil} to access the municipio local service. Add custom service methods to <code>formulario.contato.service.impl.MunicipioLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the municipio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Municipio addMunicipio(Municipio municipio);

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param municipioId the primary key for the new municipio
	 * @return the new municipio
	 */
	@Transactional(enabled = false)
	public Municipio createMunicipio(long municipioId);

	/**
	 * Deletes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws PortalException if a municipio with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Municipio deleteMunicipio(long municipioId) throws PortalException;

	/**
	 * Deletes the municipio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Municipio deleteMunicipio(Municipio municipio);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Municipio fetchMunicipio(long municipioId);

	/**
	 * Returns the municipio matching the UUID and group.
	 *
	 * @param uuid the municipio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Municipio fetchMunicipioByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the municipio with the primary key.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio
	 * @throws PortalException if a municipio with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Municipio getMunicipio(long municipioId) throws PortalException;

	/**
	 * Returns the municipio matching the UUID and group.
	 *
	 * @param uuid the municipio's UUID
	 * @param groupId the primary key of the group
	 * @return the matching municipio
	 * @throws PortalException if a matching municipio could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Municipio getMunicipioByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Municipio> getMunicipios(int start, int end);

	/**
	 * Returns all the municipios matching the UUID and company.
	 *
	 * @param uuid the UUID of the municipios
	 * @param companyId the primary key of the company
	 * @return the matching municipios, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Municipio> getMunicipiosByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Municipio> getMunicipiosByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Municipio> orderByComparator);

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMunicipiosCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param municipio the municipio
	 * @return the municipio that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Municipio updateMunicipio(Municipio municipio);

}