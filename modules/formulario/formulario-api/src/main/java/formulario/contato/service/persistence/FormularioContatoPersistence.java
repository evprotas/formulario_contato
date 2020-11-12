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

import formulario.contato.exception.NoSuchFormularioContatoException;
import formulario.contato.model.FormularioContato;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the formulario contato service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eglen
 * @see FormularioContatoUtil
 * @generated
 */
@ProviderType
public interface FormularioContatoPersistence
	extends BasePersistence<FormularioContato> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FormularioContatoUtil} to access the formulario contato persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the formulario contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching formulario contatos
	 */
	public java.util.List<FormularioContato> findByUuid(String uuid);

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
	public java.util.List<FormularioContato> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<FormularioContato> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

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
	public java.util.List<FormularioContato> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

	/**
	 * Returns the formulario contatos before and after the current formulario contato in the ordered set where uuid = &#63;.
	 *
	 * @param formularioId the primary key of the current formulario contato
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public FormularioContato[] findByUuid_PrevAndNext(
			long formularioId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Removes all the formulario contatos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of formulario contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching formulario contatos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the formulario contato where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFormularioContatoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByUUID_G(String uuid, long groupId)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the formulario contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the formulario contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the formulario contato where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the formulario contato that was removed
	 */
	public FormularioContato removeByUUID_G(String uuid, long groupId)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the number of formulario contatos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching formulario contatos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching formulario contatos
	 */
	public java.util.List<FormularioContato> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<FormularioContato> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<FormularioContato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

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
	public java.util.List<FormularioContato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the first formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the last formulario contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

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
	public FormularioContato[] findByUuid_C_PrevAndNext(
			long formularioId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Removes all the formulario contatos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of formulario contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching formulario contatos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the formulario contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching formulario contatos
	 */
	public java.util.List<FormularioContato> findByGroupId(long groupId);

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
	public java.util.List<FormularioContato> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<FormularioContato> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

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
	public java.util.List<FormularioContato> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the first formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

	/**
	 * Returns the last formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato
	 * @throws NoSuchFormularioContatoException if a matching formulario contato could not be found
	 */
	public FormularioContato findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the last formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching formulario contato, or <code>null</code> if a matching formulario contato could not be found
	 */
	public FormularioContato fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

	/**
	 * Returns the formulario contatos before and after the current formulario contato in the ordered set where groupId = &#63;.
	 *
	 * @param formularioId the primary key of the current formulario contato
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public FormularioContato[] findByGroupId_PrevAndNext(
			long formularioId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
				orderByComparator)
		throws NoSuchFormularioContatoException;

	/**
	 * Removes all the formulario contatos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of formulario contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching formulario contatos
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the formulario contato in the entity cache if it is enabled.
	 *
	 * @param formularioContato the formulario contato
	 */
	public void cacheResult(FormularioContato formularioContato);

	/**
	 * Caches the formulario contatos in the entity cache if it is enabled.
	 *
	 * @param formularioContatos the formulario contatos
	 */
	public void cacheResult(
		java.util.List<FormularioContato> formularioContatos);

	/**
	 * Creates a new formulario contato with the primary key. Does not add the formulario contato to the database.
	 *
	 * @param formularioId the primary key for the new formulario contato
	 * @return the new formulario contato
	 */
	public FormularioContato create(long formularioId);

	/**
	 * Removes the formulario contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato that was removed
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public FormularioContato remove(long formularioId)
		throws NoSuchFormularioContatoException;

	public FormularioContato updateImpl(FormularioContato formularioContato);

	/**
	 * Returns the formulario contato with the primary key or throws a <code>NoSuchFormularioContatoException</code> if it could not be found.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato
	 * @throws NoSuchFormularioContatoException if a formulario contato with the primary key could not be found
	 */
	public FormularioContato findByPrimaryKey(long formularioId)
		throws NoSuchFormularioContatoException;

	/**
	 * Returns the formulario contato with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param formularioId the primary key of the formulario contato
	 * @return the formulario contato, or <code>null</code> if a formulario contato with the primary key could not be found
	 */
	public FormularioContato fetchByPrimaryKey(long formularioId);

	/**
	 * Returns all the formulario contatos.
	 *
	 * @return the formulario contatos
	 */
	public java.util.List<FormularioContato> findAll();

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
	public java.util.List<FormularioContato> findAll(int start, int end);

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
	public java.util.List<FormularioContato> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator);

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
	public java.util.List<FormularioContato> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FormularioContato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the formulario contatos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of formulario contatos.
	 *
	 * @return the number of formulario contatos
	 */
	public int countAll();

}