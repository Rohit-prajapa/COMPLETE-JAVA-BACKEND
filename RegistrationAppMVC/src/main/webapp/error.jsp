<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">

    <title>Registration Failed</title>

    <style>

        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;

            background: linear-gradient(135deg, #ff416c, #ff4b2b);

            height: 100vh;

            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            background: white;

            width: 400px;

            padding: 40px;

            text-align: center;

            border-radius: 12px;

            box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.25);
        }

        .error {
            font-size: 60px;
            color: red;
        }

        h1 {
            color: #333;
        }

        p {
            color: #666;
        }

        .btn {
            display: inline-block;

            margin-top: 20px;

            padding: 12px 25px;

            background-color: #667eea;

            color: white;

            text-decoration: none;

            border-radius: 6px;

            font-weight: bold;
        }

    </style>

</head>

<body>

    <div class="container">

        <div class="error">
            ✕
        </div>

        <h1>Registration Failed</h1>

        <p>
            Something went wrong. Please try again.
        </p>

        <a href="index.html" class="btn">
            Try Again
        </a>

    </div>

</body>
</html>