import { Link } from 'react-router-dom';

function Navbar() {
  return (
    <nav className="bg-gray-800 p-4 text-white flex space-x-4">
      <Link to="/" className="hover:underline">Home</Link>
      <Link to="/movies" className="hover:underline">Movies</Link>
      <Link to="/about" className="hover:underline">About</Link>
    </nav>
  );
}

export default Navbar;
