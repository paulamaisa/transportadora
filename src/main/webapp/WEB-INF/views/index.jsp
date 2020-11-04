<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Principal </title>
		<link rel="stylesheet" type="text/css" 	href="../static/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css"></link>
		<link rel="stylesheet" type="text/css" 	href="../static/bootstrap-3.3.5-dist/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" 	href="../static/bootstrap-3.3.5-dist/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" 	href="../static/bootstrap-3.3.5-dist/css/bootstrap-theme.css"></link>
	</head>
	<body>
		
		<div class="container">

		<h3>Principal</h3>
		<br /> 
		<a href="<s:url value="/transportadora/cadastroPacotes" />"
			class="btn btn-default"> <span class="fa fa-plus"></span> 
			Cadastrar Pacotes
		</a> 
		<br /> 
		<div class="form-group input-group">
			<span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
			<input name="consulta" id="txt_consulta" placeholder="Consultar situação do objeto" type="text" class="form-control">
 		</div>
		<br />
		</div>
		
		<table id="pacote-table"
			class="table table-striped table-bordered table-hover table-condensed small">
			<thead>
				<tr>
					<th>Código Rastreio</th>
					<th>Descrição</th>
					<th>Data</th>
					<th>Origem</th>
					<th>Destino</th>
					<th>Status atual</th>
					<th>&nbsp;</th>
				</tr>
			</thead>
			<tbody>
					<tr>
						<td>${pacote.codRastreio}</td>
						<td>${pacote.descricao}</td>
						<td>${pacote.dataPostagem}</td>
						<td>${pacote.origem}</td>
						<td>${pacote.destino}</td>
						<td>${pacote.statusPacote}</td>						

						<td class="text-center">
							<a
								href="<s:url value="" />"
								class="btn btn-default btn-xs"
								title='<fmt:message key="button.edit"/>'> <span
								class="glyphicon glyphicon-pencil"></span> 
							</a>
							<a
								href="<s:url value="" />"
								class="btn btn-default btn-xs"
								title='<fmt:message key="button.delete"/>'> 
								<span class="glyphicon glyphicon-trash"></span> 
							</a>
						</td>
					</tr>
			</tbody>
		</table>
	</body>
</html>