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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import formulario.contato.exception.NoSuchEstadoException;
import formulario.contato.model.Estado;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the estado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eglen
 * @see EstadoUtil
 * @generated
 */
@ProviderType
public interface EstadoPersistence extends BasePersistence<Estado> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EstadoUtil} to access the estado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the estados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching estados
	 */
	public java.util.List<Estado> findByUuid(String uuid);

	/**
	 * Returns a range of all the estados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @return the range of matching estados
	 */
	public java.util.List<Estado> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the estados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching estados
	 */
	public java.util.List<Estado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the estados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching estados
	 */
	public java.util.List<Estado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first estado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Returns the first estado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns the last estado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Returns the last estado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns the estados before and after the current estado in the ordered set where uuid = &#63;.
	 *
	 * @param estadoId the primary key of the current estado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next estado
	 * @throws NoSuchEstadoException if a estado with the primary key could not be found
	 */
	public Estado[] findByUuid_PrevAndNext(
			long estadoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Removes all the estados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of estados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching estados
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the estado where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEstadoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByUUID_G(String uuid, long groupId)
		throws NoSuchEstadoException;

	/**
	 * Returns the estado where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the estado where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the estado where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the estado that was removed
	 */
	public Estado removeByUUID_G(String uuid, long groupId)
		throws NoSuchEstadoException;

	/**
	 * Returns the number of estados where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching estados
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the estados where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching estados
	 */
	public java.util.List<Estado> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the estados where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @return the range of matching estados
	 */
	public java.util.List<Estado> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the estados where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching estados
	 */
	public java.util.List<Estado> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the estados where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching estados
	 */
	public java.util.List<Estado> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first estado in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Returns the first estado in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns the last estado in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Returns the last estado in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns the estados before and after the current estado in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param estadoId the primary key of the current estado
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next estado
	 * @throws NoSuchEstadoException if a estado with the primary key could not be found
	 */
	public Estado[] findByUuid_C_PrevAndNext(
			long estadoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Removes all the estados where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of estados where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching estados
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the estados where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching estados
	 */
	public java.util.List<Estado> findByGroupId(long groupId);

	/**
	 * Returns a range of all the estados where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @return the range of matching estados
	 */
	public java.util.List<Estado> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the estados where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching estados
	 */
	public java.util.List<Estado> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the estados where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching estados
	 */
	public java.util.List<Estado> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first estado in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Returns the first estado in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns the last estado in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching estado
	 * @throws NoSuchEstadoException if a matching estado could not be found
	 */
	public Estado findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Returns the last estado in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching estado, or <code>null</code> if a matching estado could not be found
	 */
	public Estado fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns the estados before and after the current estado in the ordered set where groupId = &#63;.
	 *
	 * @param estadoId the primary key of the current estado
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next estado
	 * @throws NoSuchEstadoException if a estado with the primary key could not be found
	 */
	public Estado[] findByGroupId_PrevAndNext(
			long estadoId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Estado>
				orderByComparator)
		throws NoSuchEstadoException;

	/**
	 * Removes all the estados where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of estados where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching estados
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the estado in the entity cache if it is enabled.
	 *
	 * @param estado the estado
	 */
	public void cacheResult(Estado estado);

	/**
	 * Caches the estados in the entity cache if it is enabled.
	 *
	 * @param estados the estados
	 */
	public void cacheResult(java.util.List<Estado> estados);

	/**
	 * Creates a new estado with the primary key. Does not add the estado to the database.
	 *
	 * @param estadoId the primary key for the new estado
	 * @return the new estado
	 */
	public Estado create(long estadoId);

	/**
	 * Removes the estado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param estadoId the primary key of the estado
	 * @return the estado that was removed
	 * @throws NoSuchEstadoException if a estado with the primary key could not be found
	 */
	public Estado remove(long estadoId) throws NoSuchEstadoException;

	public Estado updateImpl(Estado estado);

	/**
	 * Returns the estado with the primary key or throws a <code>NoSuchEstadoException</code> if it could not be found.
	 *
	 * @param estadoId the primary key of the estado
	 * @return the estado
	 * @throws NoSuchEstadoException if a estado with the primary key could not be found
	 */
	public Estado findByPrimaryKey(long estadoId) throws NoSuchEstadoException;

	/**
	 * Returns the estado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param estadoId the primary key of the estado
	 * @return the estado, or <code>null</code> if a estado with the primary key could not be found
	 */
	public Estado fetchByPrimaryKey(long estadoId);

	/**
	 * Returns all the estados.
	 *
	 * @return the estados
	 */
	public java.util.List<Estado> findAll();

	/**
	 * Returns a range of all the estados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @return the range of estados
	 */
	public java.util.List<Estado> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the estados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of estados
	 */
	public java.util.List<Estado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the estados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of estados
	 */
	public java.util.List<Estado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Estado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the estados from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of estados.
	 *
	 * @return the number of estados
	 */
	public int countAll();

}