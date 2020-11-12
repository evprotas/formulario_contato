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

package formulario.contato.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import formulario.contato.model.Municipio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Municipio in entity cache.
 *
 * @author Eglen
 * @generated
 */
public class MunicipioCacheModel
	implements CacheModel<Municipio>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MunicipioCacheModel)) {
			return false;
		}

		MunicipioCacheModel municipioCacheModel = (MunicipioCacheModel)obj;

		if ((municipioId == municipioCacheModel.municipioId) &&
			(mvccVersion == municipioCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, municipioId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", municipioId=");
		sb.append(municipioId);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", codigo=");
		sb.append(codigo);
		sb.append(", estadoId=");
		sb.append(estadoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Municipio toEntityModel() {
		MunicipioImpl municipioImpl = new MunicipioImpl();

		municipioImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			municipioImpl.setUuid("");
		}
		else {
			municipioImpl.setUuid(uuid);
		}

		municipioImpl.setMunicipioId(municipioId);

		if (nome == null) {
			municipioImpl.setNome("");
		}
		else {
			municipioImpl.setNome(nome);
		}

		if (codigo == null) {
			municipioImpl.setCodigo("");
		}
		else {
			municipioImpl.setCodigo(codigo);
		}

		municipioImpl.setEstadoId(estadoId);
		municipioImpl.setGroupId(groupId);
		municipioImpl.setCompanyId(companyId);
		municipioImpl.setUserId(userId);

		if (userName == null) {
			municipioImpl.setUserName("");
		}
		else {
			municipioImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			municipioImpl.setCreateDate(null);
		}
		else {
			municipioImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			municipioImpl.setModifiedDate(null);
		}
		else {
			municipioImpl.setModifiedDate(new Date(modifiedDate));
		}

		municipioImpl.setStatus(status);
		municipioImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			municipioImpl.setStatusByUserName("");
		}
		else {
			municipioImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			municipioImpl.setStatusDate(null);
		}
		else {
			municipioImpl.setStatusDate(new Date(statusDate));
		}

		municipioImpl.resetOriginalValues();

		return municipioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		municipioId = objectInput.readLong();
		nome = objectInput.readUTF();
		codigo = objectInput.readUTF();

		estadoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(municipioId);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (codigo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codigo);
		}

		objectOutput.writeLong(estadoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public long mvccVersion;
	public String uuid;
	public long municipioId;
	public String nome;
	public String codigo;
	public long estadoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}