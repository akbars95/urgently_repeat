<html>
<body>
<h2>HWService</h2>
<ul>
    <li><a href="rest/hw/">Hello</a></li>
    <li><a href="rest/hw/withParam">withParam</a></li>
</ul>


<h2>RegularExpService</h2>
<ul>
    <li><a href="rest/rexs/95">Id</a></li>
    <li><a href="rest/rexs/username/us">String and numbers</a></li>
    <li><a href="rest/rexs/username/ivanov953">Username min 5 and max 9</a></li>
</ul>

<h2>ParamService</h2>
<ul>
    <li><a href="rest/param/date/15/10/2005">date 15.10.2015</a></li>
</ul>

<h2>QueryParamService</h2>
<ul>
    <li><a href="rest/query/get?from=19&to=25&orderBy=Ivanov&orderBy=Ivan">Ivanov Ivan</a></li>
    <li><a href="rest/query/get2?from=9&to=300&orderBy=Petrov&orderBy=Petr">Petrov Petr</a></li>
    <li><a href="rest/query/getDefault">getDefault</a></li>
</ul>

<h2>MatrixParamService</h2>
<ul>
    <li><a href="rest/matrix/books/book/2015">year - 2015</a></li>
    <li><a href="rest/matrix/books/book/2015;author=Iliin">year - 2015, Iliin</a></li>
    <li><a href="rest/matrix/books/book/2015;author=Iliin;country=Moldova">year - 2015, Iliin, Moldova</a></li>
    <li><a href="rest/matrix/books/book/2015;country=Moldova;author=Iliin;">year - 2015, Moldova, Iliin</a></li>
</ul>

<h2>FormParamService</h2>
<ul>
    <li><a href="form.jsp">Add person</a></li>
</ul>

<h2>HeaderParamService</h2>
<ul>
    <li><a href="rest/header/getHeader">Get header user agent</a></li>
    <li><a href="rest/header/getHeaderFromContext">Get header user agent from context</a></li>
    <li><a href="rest/header/getHeadersFromContext">Get headers from context</a></li>
</ul>

<h2>FileService</h2>
<ul>
    <li><a href="rest/file/getFileTxt">Get file text(txt)</a></li>
    <li><a href="rest/file/getFileImage">Get file image(png)</a></li>
    <li><a href="rest/file/getFilePDF">Get file pdf(pdf)</a></li>
    <li><a href="rest/file/getFileExcel">Get file excel(xls)</a></li>
</ul>

<h2>UploadFileService</h2>
<ul>
    <li><a href="uploadForm.jsp">Upload file</a></li>
</ul>


<h2>XMLService</h2>
<ul>
    <li><a href="rest/xml/customer/999">XML</a></li>
</ul>

<h2>JSONService</h2>
<ul>
    <li><a href="rest/json/track/get">get</a></li>
    <li><a href="rest/json/track/post">post(only via client)</a></li>
</ul>

</body>
</html>