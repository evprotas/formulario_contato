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

import formulario.contato.model.Estado;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Estado in entity cache.
 *
 * @author Eglen
 * @generated
 */
public class EstadoCacheModel
	implements CacheModel<Estado>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EstadoCacheModel)) {
			return false;
		}

		EstadoCacheModel estadoCacheModel = (EstadoCacheModel)obj;

		if ((estadoId == estadoCacheModel.estadoId) &&
			(mvccVersion == estadoCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, estadoId);

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
		StringBundler sb = new StringBundler(35);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", estadoId=");
		sb.append(estadoId);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", sigla=");
		sb.append(sigla);
		sb.append(", codigo=");
		sb.append(codigo);
		sb.append(", cidade=");
		sb.append(cidade);
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
	public Estado toEntityModel() {
		EstadoImpl estadoImpl = new EstadoImpl();

		estadoImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			estadoImpl.setUuid("");
		}
		else {
			estadoImpl.setUuid(uuid);
		}

		estadoImpl.setEstadoId(estadoId);

		if (nome == null) {
			estadoImpl.setNome("");
		}
		else {
			estadoImpl.setNome(nome);
		}

		if (sigla == null) {
			estadoImpl.setSigla("");
		}
		else {
			estadoImpl.setSigla(sigla);
		}

		if (codigo == null) {
			estadoImpl.setCodigo("");
		}
		else {
			estadoImpl.setCodigo(codigo);
		}

		if (cidade == null) {
			estadoImpl.setCidade("");
		}
		else {
			estadoImpl.setCidade(cidade);
		}

		estadoImpl.setGroupId(groupId);
		estadoImpl.setCompanyId(companyId);
		estadoImpl.setUserId(userId);

		if (userName == null) {
			estadoImpl.setUserName("");
		}
		else {
			estadoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			estadoImpl.setCreateDate(null);
		}
		else {
			estadoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			estadoImpl.setModifiedDate(null);
		}
		else {
			estadoImpl.setModifiedDate(new Date(modifiedDate));
		}

		estadoImpl.setStatus(status);
		estadoImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			estadoImpl.setStatusByUserName("");
		}
		else {
			estadoImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			estadoImpl.setStatusDate(null);
		}
		else {
			estadoImpl.setStatusDate(new Date(statusDate));
		}

		estadoImpl.resetOriginalValues();

		return estadoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		estadoId = objectInput.readLong();
		nome = objectInput.readUTF();
		sigla = objectInput.readUTF();
		codigo = objectInput.readUTF();
		cidade = objectInput.readUTF();

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

		objectOutput.writeLong(estadoId);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (sigla == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sigla);
		}

		if (codigo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codigo);
		}

		if (cidade == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cidade);
		}

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
	public long estadoId;
	public String nome;
	public String sigla;
	public String codigo;
	public String cidade;
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