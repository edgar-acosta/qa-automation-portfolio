import unittest
import requests

class TestJSONPlaceholderAPI(unittest.TestCase):

    def test_get_post(self):
        response = requests.get("https://jsonplaceholder.typicode.com/posts/1")
        self.assertEqual(response.status_code, 200)
        self.assertIn("userId", response.json())

if __name__ == "__main__":
    unittest.main()
