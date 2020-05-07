# spring-cache-example
 
 <body lang=EL link=blue vlink="#954F72" style='tab-interval:.5in'>

<div class=WordSection1>

<p class=MsoNormal><span lang=EN-US style='mso-ansi-language:EN-US'>The project
with source code is the </span><a
href="https://github.com/hoolser/spring-cache-example/tree/master/spring-cache1"
title=spring-cache1><span lang=EN-US style='font-size:10.5pt;line-height:106%;
font-family:"Segoe UI",sans-serif;color:#0366D6;background:#F6F8FA;mso-ansi-language:
EN-US;text-decoration:none;text-underline:none'>spring-cache1</span></a><span
style='mso-ansi-language:EN-US'> <span lang=EN-US>folder.<o:p></o:p></span></span></p>

<p class=MsoNormal><span lang=EN-US style='mso-ansi-language:EN-US'>To run the
application there is a war file (</span><a
href="https://github.com/hoolser/spring-cache-example/blob/master/spring-cache-0.0.1-SNAPSHOT.war"
title=spring-cache-0.0.1-SNAPSHOT.war><span lang=EN-US style='font-size:10.5pt;
line-height:106%;font-family:"Segoe UI",sans-serif;color:#0366D6;background:
white;mso-ansi-language:EN-US;text-decoration:none;text-underline:none'>spring-cache-0.0.1-SNAPSHOT.war</span></a><span
lang=EN-US style='mso-ansi-language:EN-US'>).<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='mso-ansi-language:EN-US'>To run the
application: java -jar spring-cache-0.0.1-SNAPSHOT.war<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='mso-ansi-language:EN-US'>When app is
running type at browser </span><a href="http://localhost:8080/"><span
lang=EN-US style='mso-ansi-language:EN-US'>http://localhost:8080/</span></a><span
lang=EN-US style='mso-ansi-language:EN-US'>.<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='mso-ansi-language:EN-US'>It will be
shown <span style='color:#222222;background:white'>as a landing page</span> a
form to register as a new user or a login option.<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>If you submit the form, application will save your
data in cache and will assign you to a unique id, which will tell you with a
successful message page.</span><span lang=EN-US style='mso-ansi-language:EN-US'><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>If you try the log in option, you should give <span
class=GramE>an</span> user id to find this user in cache.</span><span
lang=EN-US style='mso-ansi-language:EN-US'><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>If this user exists in Cache memory the data of this
user will be shown.</span><span lang=EN-US style='mso-ansi-language:EN-US'><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>If the id is not found in the <span class=GramE>cache</span>
then the</span><span lang=EN-US style='mso-ansi-language:EN-US'> controller
returns an erroneous page.<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>Also, you can find an existing user in cache typing in
browser </span><span lang=EN-US style='mso-ansi-language:EN-US'>http://localhost:8080/user
/{Id}<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>If this user exists in Cache memory the data of this
user will be shown <span class=GramE>and also</span> app will return in JSON
format the result of this user.</span><span lang=EN-US style='mso-ansi-language:
EN-US'><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>If the id is not found in the cache app returns an
erroneous page</span><span lang=EN-US style='mso-ansi-language:EN-US'>.<o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='color:#222222;background:white;
mso-ansi-language:EN-US'>&nbsp;</span><span lang=EN-US style='mso-ansi-language:
EN-US'><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='mso-ansi-language:EN-US'>&nbsp;<o:p></o:p></span></p>

</div>

</body>

</html>

