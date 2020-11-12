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

import formulario.contato.model.FormularioContato;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FormularioContato in entity cache.
 *
 * @author Eglen
 * @generated
 */
public class FormularioContatoCacheModel
	implements CacheModel<FormularioContato>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FormularioContatoCacheModel)) {
			return false;
		}

		FormularioContatoCacheModel formularioContatoCacheModel =
			(FormularioContatoCacheModel)obj;

		if ((formularioId == formularioContatoCacheModel.formularioId) &&
			(mvccVersion == formularioContatoCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, formularioId);

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
		StringBundler sb = new StringBundler(39);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", formularioId=");
		sb.append(formularioId);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", email=");
		sb.append(email);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", cidade=");
		sb.append(cidade);
		sb.append(", mensagem=");
		sb.append(mensagem);
		sb.append(", protocolo=");
		sb.append(protocolo);
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
	public FormularioContato toEntityModel() {
		FormularioContatoImpl formularioContatoImpl =
			new FormularioContatoImpl();

		formularioContatoImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			formularioContatoImpl.setUuid("");
		}
		else {
			formularioContatoImpl.setUuid(uuid);
		}

		formularioContatoImpl.setFormularioId(formularioId);

		if (nome == null) {
			formularioContatoImpl.setNome("");
		}
		else {
			formularioContatoImpl.setNome(nome);
		}

		if (email == null) {
			formularioContatoImpl.setEmail("");
		}
		else {
			formularioContatoImpl.setEmail(email);
		}

		if (estado == null) {
			formularioContatoImpl.setEstado("");
		}
		else {
			formularioContatoImpl.setEstado(estado);
		}

		if (cidade == null) {
			formularioContatoImpl.setCidade("");
		}
		else {
			formularioContatoImpl.setCidade(cidade);
		}

		if (mensagem == null) {
			formularioContatoImpl.setMensagem("");
		}
		else {
			formularioContatoImpl.setMensagem(mensagem);
		}

		if (protocolo == null) {
			formularioContatoImpl.setProtocolo("");
		}
		else {
			formularioContatoImpl.setProtocolo(protocolo);
		}

		formularioContatoImpl.setGroupId(groupId);
		formularioContatoImpl.setCompanyId(companyId);
		formularioContatoImpl.setUserId(userId);

		if (userName == null) {
			formularioContatoImpl.setUserName("");
		}
		else {
			formularioContatoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			formularioContatoImpl.setCreateDate(null);
		}
		else {
			formularioContatoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			formularioContatoImpl.setModifiedDate(null);
		}
		else {
			formularioContatoImpl.setModifiedDate(new Date(modifiedDate));
		}

		formularioContatoImpl.setStatus(status);
		formularioContatoImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			formularioContatoImpl.setStatusByUserName("");
		}
		else {
			formularioContatoImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			formularioContatoImpl.setStatusDate(null);
		}
		else {
			formularioContatoImpl.setStatusDate(new Date(statusDate));
		}

		formularioContatoImpl.resetOriginalValues();

		return formularioContatoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		formularioId = objectInput.readLong();
		nome = objectInput.readUTF();
		email = objectInput.readUTF();
		estado = objectInput.readUTF();
		cidade = objectInput.readUTF();
		mensagem = objectInput.readUTF();
		protocolo = objectInput.readUTF();

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

		objectOutput.writeLong(formularioId);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (estado == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (cidade == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cidade);
		}

		if (mensagem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mensagem);
		}

		if (protocolo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(protocolo);
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
	public long formularioId;
	public String nome;
	public String email;
	public String estado;
	public String cidade;
	public String mensagem;
	public String protocolo;
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