<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">

    <title>Registration Successful</title>

    <style>

        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #667eea, #764ba2);

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

        .success {
            font-size: 60px;
            color: green;
        }

        h1 {
            color: #333;
        }

        p {
            color: #666;
            font-size: 16px;
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

        .btn:hover {
            background-color: #5568d9;
        }

    </style>

</head>

<body>

    <div class="container">

        <div class="success">
            ✓
        </div>

        <h1>Registration Successful!</h1>

        <p>
            Your registration has been completed successfully.
        </p>

        <a href="index.html" class="btn">
            Register Another User
        </a>

    </div>

</body>
</html>