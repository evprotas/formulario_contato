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

package formulario.contato.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import formulario.contato.model.Municipio;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the municipio service. This utility wraps <code>formulario.contato.service.persistence.impl.MunicipioPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eglen
 * @see MunicipioPersistence
 * @generated
 */
public class MunicipioUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Municipio municipio) {
		getPersistence().clearCache(municipio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Municipio> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Municipio update(Municipio municipio) {
		return getPersistence().update(municipio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Municipio update(
		Municipio municipio, ServiceContext serviceContext) {

		return getPersistence().update(municipio, serviceContext);
	}

	/**
	 * Returns all the municipios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching municipios
	 */
	public static List<Municipio> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the municipios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of matching municipios
	 */
	public static List<Municipio> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the municipios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching municipios
	 */
	public static List<Municipio> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the municipios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching municipios
	 */
	public static List<Municipio> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Municipio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByUuid_First(
			String uuid, OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByUuid_First(
		String uuid, OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByUuid_Last(
			String uuid, OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByUuid_Last(
		String uuid, OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the municipios before and after the current municipio in the ordered set where uuid = &#63;.
	 *
	 * @param municipioId the primary key of the current municipio
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public static Municipio[] findByUuid_PrevAndNext(
			long municipioId, String uuid,
			OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUuid_PrevAndNext(
			municipioId, uuid, orderByComparator);
	}

	/**
	 * Removes all the municipios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of municipios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching municipios
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the municipio where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMunicipioException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByUUID_G(String uuid, long groupId)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the municipio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the municipio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the municipio where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the municipio that was removed
	 */
	public static Municipio removeByUUID_G(String uuid, long groupId)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of municipios where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching municipios
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching municipios
	 */
	public static List<Municipio> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of matching municipios
	 */
	public static List<Municipio> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching municipios
	 */
	public static List<Municipio> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching municipios
	 */
	public static List<Municipio> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Municipio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the municipios before and after the current municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param municipioId the primary key of the current municipio
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public static Municipio[] findByUuid_C_PrevAndNext(
			long municipioId, String uuid, long companyId,
			OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByUuid_C_PrevAndNext(
			municipioId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the municipios where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching municipios
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the municipios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching municipios
	 */
	public static List<Municipio> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the municipios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of matching municipios
	 */
	public static List<Municipio> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the municipios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching municipios
	 */
	public static List<Municipio> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the municipios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching municipios
	 */
	public static List<Municipio> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Municipio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByGroupId_First(
			long groupId, OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByGroupId_First(
		long groupId, OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public static Municipio findByGroupId_Last(
			long groupId, OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public static Municipio fetchByGroupId_Last(
		long groupId, OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the municipios before and after the current municipio in the ordered set where groupId = &#63;.
	 *
	 * @param municipioId the primary key of the current municipio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public static Municipio[] findByGroupId_PrevAndNext(
			long municipioId, long groupId,
			OrderByComparator<Municipio> orderByComparator)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByGroupId_PrevAndNext(
			municipioId, groupId, orderByComparator);
	}

	/**
	 * Removes all the municipios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of municipios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching municipios
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the municipio in the entity cache if it is enabled.
	 *
	 * @param municipio the municipio
	 */
	public static void cacheResult(Municipio municipio) {
		getPersistence().cacheResult(municipio);
	}

	/**
	 * Caches the municipios in the entity cache if it is enabled.
	 *
	 * @param municipios the municipios
	 */
	public static void cacheResult(List<Municipio> municipios) {
		getPersistence().cacheResult(municipios);
	}

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param municipioId the primary key for the new municipio
	 * @return the new municipio
	 */
	public static Municipio create(long municipioId) {
		return getPersistence().create(municipioId);
	}

	/**
	 * Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public static Municipio remove(long municipioId)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().remove(municipioId);
	}

	public static Municipio updateImpl(Municipio municipio) {
		return getPersistence().updateImpl(municipio);
	}

	/**
	 * Returns the municipio with the primary key or throws a <code>NoSuchMunicipioException</code> if it could not be found.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public static Municipio findByPrimaryKey(long municipioId)
		throws formulario.contato.exception.NoSuchMunicipioException {

		return getPersistence().findByPrimaryKey(municipioId);
	}

	/**
	 * Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	 */
	public static Municipio fetchByPrimaryKey(long municipioId) {
		return getPersistence().fetchByPrimaryKey(municipioId);
	}

	/**
	 * Returns all the municipios.
	 *
	 * @return the municipios
	 */
	public static List<Municipio> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of municipios
	 */
	public static List<Municipio> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of municipios
	 */
	public static List<Municipio> findAll(
		int start, int end, OrderByComparator<Municipio> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MunicipioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of municipios
	 */
	public static List<Municipio> findAll(
		int start, int end, OrderByComparator<Municipio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the municipios from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MunicipioPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MunicipioPersistence, MunicipioPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MunicipioPersistence.class);

		ServiceTracker<MunicipioPersistence, MunicipioPersistence>
			serviceTracker =
				new ServiceTracker<MunicipioPersistence, MunicipioPersistence>(
					bundle.getBundleContext(), MunicipioPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}