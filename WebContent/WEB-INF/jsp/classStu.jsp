<%--
  Created by IntelliJ IDEA.
  User: WBULL
  Date: 2018/4/10
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
	<div style="margin-top: 10%;">
		<form action="stulist.do" method="post" style="margin-left: 47%;">
            <table >
                <tr>
                    <td>
                        面试时间
                    </td>
                    <td>
                        <select name="af" id="">
                            <option value="上午" selected="selected">上午</option>
                            <option value="下午">下午</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        考场
                    </td>
                    <td>
                        <select name="room" id="">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                            <option value="21">21</option>
                            <option value="22">22</option>
                            <option value="23">23</option>
                            <option value="24">24</option>
                            <option value="25">25</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>轮数</td>
                    <td>
                        <select name="turns" id="">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>
                        <input type="submit" value="查询">
                    </th>
                </tr>
            </table>
        </form>
		
	</div>
        
</body>
</html>
