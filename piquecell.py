from flask import Flask
from flask import jsonify
app = Flask(__name__)

@app.route('/load')
def load():
    return jsonify(
        grid={
            'origin': {
                'x': 0,
                'y': 0
            },
            'cells': [
                [
                    {
                        'playerId': 0
                    }
                ]
            ]
        },
        user={
            'name': 'John'
        }
    )
