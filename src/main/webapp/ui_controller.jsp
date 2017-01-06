<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles/ui.css"/>

  <title>REST ContainerView Examples</title>
</head>
<body class="controller">
<img src="images/redhat_icon.png" width=30 alt="Red Hat UK"/>

<b>Select a REST Service to view in lower portion of screen:</b><br/><br/>
&nbsp;&nbsp;<a href="rest/env" target="content">Environment Variables</a><br/>
&nbsp;&nbsp;<a href="rest/ip" target="content">IP Address</a><br/>
&nbsp;&nbsp;<a href="rest/quotas" target="content">Quotas</a><br/>
&nbsp;&nbsp;[MBEAN] <a href="rest/mbeans/runtime" target="content">Runtime Data</a><br/>
&nbsp;&nbsp;[MBEAN] <a href="rest/mbeans/memory" target="content">Memory Settings/Usage</a><br/>
</body>
</html>
