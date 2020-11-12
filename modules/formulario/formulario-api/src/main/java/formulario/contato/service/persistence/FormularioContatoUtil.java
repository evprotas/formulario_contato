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

import formulario.contato.model.FormularioContato;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the formulario contato service. This utility wraps <code>formulario.contato.service.persistence.impl.FormularioContatoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eglen
 * @see FormularioContatoPersistence
 * @generated
 */
public class FormularioContatoUtil {

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
	public static void clearCache(FormularioContato formularioContato) {
		getPersistence().clearCache(formularioContato);
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
	public static Map<Serializable, FormularioContato> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FormularioContato> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FormularioContato> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FormularioContato> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FormularioContato update(
		FormularioContato formularioContato) {

		return getPersistence().update(formularioContato);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FormularioContato update(
		FormularioContato formularioContato, ServiceContext serviceContext) {

		return getPersistence().update(formularioContato, serviceContext);
	}

	/**
	 * Returns all the formulario contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the formulario contatos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @return the range of matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the formulario contatos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the formulario contatos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByUuid_First(
			String uuid, OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByUuid_First(
		String uuid, OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByUuid_Last(
			String uuid, OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByUuid_Last(
		String uuid, OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the formulario contatos before and after the current formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param formularioId the primary key of the current formulario contato
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public static FormularioContato[] findByUuid_PrevAndNext(
			long formularioId, String uuid,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUuid_PrevAndNext(
			formularioId, uuid, orderByComparator);
	}

	/**
	 * Removes all the formulario contatos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of formulario contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching formulario contatos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the formulario contato where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFormularioContatoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByUUID_G(String uuid, long groupId)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the formulario contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the formulario contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the formulario contato where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the formulario contato that was removed
	 */
	public static FormularioContato removeByUUID_G(String uuid, long groupId)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of formulario contatos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching formulario contatos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @return the range of matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching formulario contatos
	 */
	public static List<FormularioContato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the formulario contatos before and after the current formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param formularioId the primary key of the current formulario contato
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public static FormularioContato[] findByUuid_C_PrevAndNext(
			long formularioId, String uuid, long companyId,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			formularioId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the formulario contatos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching formulario contatos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the formulario contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching formulario contatos
	 */
	public static List<FormularioContato> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the formulario contatos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @return the range of matching formulario contatos
	 */
	public static List<FormularioContato> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the formulario contatos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching formulario contatos
	 */
	public static List<FormularioContato> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the formulario contatos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching formulario contatos
	 */
	public static List<FormularioContato> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<FormularioContato> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByGroupId_First(
			long groupId,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByGroupId_First(
		long groupId, OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public static FormularioContato findByGroupId_Last(
			long groupId,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public static FormularioContato fetchByGroupId_Last(
		long groupId, OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the formulario contatos before and after the current formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param formularioId the primary key of the current formulario contato
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public static FormularioContato[] findByGroupId_PrevAndNext(
			long formularioId, long groupId,
			OrderByComparator<FormularioContato> orderByComparator)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByGroupId_PrevAndNext(
			formularioId, groupId, orderByComparator);
	}

	/**
	 * Removes all the formulario contatos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of formulario contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching formulario contatos
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the formulario contato in the entity cache if it is enabled.
	 *
	 * @param formularioContato the formulario contato
	 */
	public static void cacheResult(FormularioContato formularioContato) {
		getPersistence().cacheResult(formularioContato);
	}

	/**
	 * Caches the formulario contatos in the entity cache if it is enabled.
	 *
	 * @param formularioContatos the formulario contatos
	 */
	public static void cacheResult(List<FormularioContato> formularioContatos) {
		getPersistence().cacheResult(formularioContatos);
	}

	/**
	 * Creates a new formulario contato with the primary key. Does not add the formulario contato to the database.
	 *
	 * @param formularioId the primary key for the new formulario contato
	 * @return the new formulario contato
	 */
	public static FormularioContato create(long formularioId) {
		return getPersistence().create(formularioId);
	}

	/**
	 * Removes the formulario contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato that was removed
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public static FormularioContato remove(long formularioId)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().remove(formularioId);
	}

	public static FormularioContato updateImpl(
		FormularioContato formularioContato) {

		return getPersistence().updateImpl(formularioContato);
	}

	/**
	 * Returns the formulario contato with the primary key or throws a <code>NoSuchFormularioContatoException</code> if it could not be found.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public static FormularioContato findByPrimaryKey(long formularioId)
		throws formulario.contato.exception.NoSuchFormularioContatoException {

		return getPersistence().findByPrimaryKey(formularioId);
	}

	/**
	 * Returns the formulario contato with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato, or <code>null</code> if a formulario contato with the primary key could not be found
	 */
	public static FormularioContato fetchByPrimaryKey(long formularioId) {
		return getPersistence().fetchByPrimaryKey(formularioId);
	}

	/**
	 * Returns all the formulario contatos.
	 *
	 * @return the formulario contatos
	 */
	public static List<FormularioContato> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the formulario contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @return the range of formulario contatos
	 */
	public static List<FormularioContato> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the formulario contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of formulario contatos
	 */
	public static List<FormularioContato> findAll(
		int start, int end,
		OrderByComparator<FormularioContato> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the formulario contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FormularioContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of formulario contatos
	 * @param end the upper bound of the range of formulario contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of formulario contatos
	 */
	public static List<FormularioContato> findAll(
		int start, int end,
		OrderByComparator<FormularioContato> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the formulario contatos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of formulario contatos.
	 *
	 * @return the number of formulario contatos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FormularioContatoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<FormularioContatoPersistence, FormularioContatoPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			FormularioContatoPersistence.class);

		ServiceTracker
			<FormularioContatoPersistence, FormularioContatoPersistence>
				serviceTracker =
					new ServiceTracker
						<FormularioContatoPersistence,
						 FormularioContatoPersistence>(
							 bundle.getBundleContext(),
							 FormularioContatoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}