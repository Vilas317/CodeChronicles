import React, { useState, useEffect } from 'react';
import { Bell, Search, ChevronDown } from 'lucide-react';

const Navbar = () => {
  const [isScrolled, setIsScrolled] = useState(false);

  useEffect(() => {
    const handleScroll = () => {
      if (window.scrollY > 0) {
        setIsScrolled(true);
      } else {
        setIsScrolled(false);
      }
    };

    window.addEventListener('scroll', handleScroll);
    return () => window.removeEventListener('scroll', handleScroll);
  }, []);

  return (
    <nav className={`fixed w-full z-40 transition-colors duration-300 ${isScrolled ? 'bg-black' : 'bg-transparent'}`}>
      <div className="px-4 md:px-16 py-6 flex items-center justify-between">
        <div className="flex items-center gap-8">
          <img 
            src="https://upload.wikimedia.org/wikipedia/commons/0/08/Netflix_2015_logo.svg"
            alt="Netflix"
            className="h-5"
          />
          <div className="hidden md:flex gap-7">
            <a href="#" className="text-sm font-light hover:text-gray-300">Home</a>
            <a href="#" className="text-sm font-light hover:text-gray-300">TV Shows</a>
            <a href="#" className="text-sm font-light hover:text-gray-300">Movies</a>
            <a href="#" className="text-sm font-light hover:text-gray-300">New & Popular</a>
            <a href="#" className="text-sm font-light hover:text-gray-300">My List</a>
          </div>
        </div>
        <div className="flex items-center gap-7">
          <Search className="w-5 h-5 cursor-pointer hover:text-gray-300" />
          <Bell className="w-5 h-5 cursor-pointer hover:text-gray-300" />
          <div className="flex items-center gap-2 cursor-pointer">
            <img
              src="https://images.unsplash.com/photo-1633332755192-727a05c4013d?w=100&h=100&fit=crop"
              alt="Profile"
              className="w-8 h-8 rounded"
            />
            <ChevronDown className="w-4 h-4" />
          </div>
        </div>
      </div>
    </nav>
  );
}

export default Navbar;