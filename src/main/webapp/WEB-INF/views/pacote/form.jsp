<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Transporte | Página Index</title>
	<link rel="stylesheet" type="text/css"
		href="../static/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css"></link>
	<link rel="stylesheet" type="text/css"
		href="../static/bootstrap-3.3.5-dist/css/bootstrap.css">
	<link rel="stylesheet" type="text/css"
		href="../static/bootstrap-3.3.5-dist/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css"
		href="../static/bootstrap-3.3.5-dist/css/bootstrap-theme.css"></link>
	</head>
<body>

	<s:url value="/transportadora/salvar" var="acao" />
	<div class="container">
		<br />
		<br />
		<h3>
			<strong>Cadastro de Pacotes para envio</strong>
		</h3>
		<br />
		<br />
		<sf:form method="post" modelAttribute="pacote" action="${acao}">
			<c:if test="${not empty pacote.id}">
				<sf:hidden path="id" />
			</c:if>

			<div class="form-group">
				<label for="descricao">Descricao do Objeto a ser enviado</label>
				<sf:input path="descricao" class="form-control"
					aria-describedby="emailHelp" />
			</div>
			
			<div class="form-group">
				<label for="codRastreio">Código de Rastreio</label>
				<sf:input path="codRastreio" class="form-control"
					aria-describedby="codRastreio" />
			</div>
			
			<div class="data">
				<label for="dataHrPostagem">Data de postagem:</label>
				<fmt:formatDate value="${dataPostagem}" var="dateString" pattern="dd/MM/yyyy" />
				${dateString}
				<sf:input value="${dateString}" path="dataPostagem" class="form-control data" placeholder="Ex.: dd/MM/yyyy" />
			</div>
			<div class="form-group">
				<label for="origem">Origem:</label>
				<sf:input path="origem" class="form-control"
					aria-describedby="emailHelp" />
			</div>
			<div class="form-group">
				<label for="destino">Destino:</label>
				<sf:input path="destino" class="form-control"
					aria-describedby="emailHelp" />
			</div>
			<div class="form-group">
				<label for="statusPacote">Status do pacote:</label>
				<sf:select path="statusPacote">
					<sf:option value="${statusPacote}" label="Selecione um status" />
					<sf:options items="${statusPacote}" />
				</sf:select>
			</div>
			<br />
			<button type="submit">Salvar</button>
		</sf:form>
	</div>
</body>
 
</html>