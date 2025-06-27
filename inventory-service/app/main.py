from flask import Flask, jsonify

app = Flask(__name__)

@app.route("/inventory")
def inventory():
    return jsonify([
        {"product": "Book", "stock": 34},
        {"product": "Laptop", "stock": 8},
    ])

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8000)
# This code defines a simple Flask application that serves an inventory endpoint.
# The endpoint returns a JSON response with a list of products and their stock levels.
# The application listens on all interfaces at port 8000.