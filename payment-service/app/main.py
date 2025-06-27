from fastapi import FastAPI

app = FastAPI()

@app.get("/payments")
def get_payments():
    return [
        {"id": 1, "order_id": 101, "amount": 49.99},
        {"id": 2, "order_id": 102, "amount": 799.99},
    ]
