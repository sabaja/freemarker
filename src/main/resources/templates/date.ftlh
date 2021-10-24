<html>
<body>
Last updated: ${lastUpdated}
<#-- assume that lastUpdated is a date-time value -->
        Last updated date: ${lastUpdated?date}
        Last updated time: ${lastUpdated?time}
</body>
</html>