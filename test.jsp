<%@ page import="java.io.*, java.net.*, java.util.Scanner" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>API Response</title>
    <!-- Bootstrap CSS (optional, for styling) -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }

        .container {
            max-width: 700px;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 50px;
            text-align: center;
        }

        h1 {
            color: #007bff;
        }

        .success-message {
            background-color: #d4edda;
            border: 1px solid #c3e6cb;
            color: #155724;
            padding: 15px;
            margin-top: 20px;
            border-radius: 5px;
        }

        .logo {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>API Response</h1>

        <%-- Check if the API response is not empty --%>
        <c:if test="${not empty apiResponse}">
            <div class="success-message">
                <h2>Purchase Order created successfully !</h2>
                <p>${apiResponse}</p>
            </div>
        </c:if>

        <%-- Displaying an image from an online source --%>
      
    </div>

    <!-- Bootstrap JS and Popper.js (optional, for Bootstrap components) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
