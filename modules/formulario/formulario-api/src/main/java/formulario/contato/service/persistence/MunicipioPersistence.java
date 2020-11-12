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

import formulario.contato.exception.NoSuchMunicipioException;
import formulario.contato.model.Municipio;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the municipio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eglen
 * @see MunicipioUtil
 * @generated
 */
@ProviderType
public interface MunicipioPersistence extends BasePersistence<Municipio> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MunicipioUtil} to access the municipio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the municipios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching municipios
	 */
	public java.util.List<Municipio> findByUuid(String uuid);

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
	public java.util.List<Municipio> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Municipio> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

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
	public java.util.List<Municipio> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

	/**
	 * Returns the municipios before and after the current municipio in the ordered set where uuid = &#63;.
	 *
	 * @param municipioId the primary key of the current municipio
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public Municipio[] findByUuid_PrevAndNext(
			long municipioId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Removes all the municipios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of municipios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching municipios
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the municipio where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMunicipioException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByUUID_G(String uuid, long groupId)
		throws NoSuchMunicipioException;

	/**
	 * Returns the municipio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the municipio where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the municipio where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the municipio that was removed
	 */
	public Municipio removeByUUID_G(String uuid, long groupId)
		throws NoSuchMunicipioException;

	/**
	 * Returns the number of municipios where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching municipios
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching municipios
	 */
	public java.util.List<Municipio> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Municipio> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Municipio> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

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
	public java.util.List<Municipio> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Returns the first municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Returns the last municipio in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

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
	public Municipio[] findByUuid_C_PrevAndNext(
			long municipioId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Removes all the municipios where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of municipios where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching municipios
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the municipios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching municipios
	 */
	public java.util.List<Municipio> findByGroupId(long groupId);

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
	public java.util.List<Municipio> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Municipio> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

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
	public java.util.List<Municipio> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Returns the first municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

	/**
	 * Returns the last municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio
	 * @throws NoSuchMunicipioException if a matching municipio could not be found
	 */
	public Municipio findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Returns the last municipio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching municipio, or <code>null</code> if a matching municipio could not be found
	 */
	public Municipio fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

	/**
	 * Returns the municipios before and after the current municipio in the ordered set where groupId = &#63;.
	 *
	 * @param municipioId the primary key of the current municipio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public Municipio[] findByGroupId_PrevAndNext(
			long municipioId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Municipio>
				orderByComparator)
		throws NoSuchMunicipioException;

	/**
	 * Removes all the municipios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of municipios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching municipios
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the municipio in the entity cache if it is enabled.
	 *
	 * @param municipio the municipio
	 */
	public void cacheResult(Municipio municipio);

	/**
	 * Caches the municipios in the entity cache if it is enabled.
	 *
	 * @param municipios the municipios
	 */
	public void cacheResult(java.util.List<Municipio> municipios);

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param municipioId the primary key for the new municipio
	 * @return the new municipio
	 */
	public Municipio create(long municipioId);

	/**
	 * Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public Municipio remove(long municipioId) throws NoSuchMunicipioException;

	public Municipio updateImpl(Municipio municipio);

	/**
	 * Returns the municipio with the primary key or throws a <code>NoSuchMunicipioException</code> if it could not be found.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio
	 * @throws NoSuchMunicipioException if a municipio with the primary key could not be found
	 */
	public Municipio findByPrimaryKey(long municipioId)
		throws NoSuchMunicipioException;

	/**
	 * Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param municipioId the primary key of the municipio
	 * @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	 */
	public Municipio fetchByPrimaryKey(long municipioId);

	/**
	 * Returns all the municipios.
	 *
	 * @return the municipios
	 */
	public java.util.List<Municipio> findAll();

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
	public java.util.List<Municipio> findAll(int start, int end);

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
	public java.util.List<Municipio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator);

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
	public java.util.List<Municipio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Municipio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the municipios from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 */
	public int countAll();

}