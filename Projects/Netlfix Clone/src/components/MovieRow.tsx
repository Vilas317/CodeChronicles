import React from 'react';

interface MovieRowProps {
  title: string;
  category: string;
}

const MovieRow: React.FC<MovieRowProps> = ({ title, category }) => {
  // In a real app, these would come from an API
  const movies = [
    { id: 1, image: "https://images.unsplash.com/photo-1536440136628-849c177e76a1?w=300&h=450&fit=crop" },
    { id: 2, image: "https://images.unsplash.com/photo-1485846234645-a62644f84728?w=300&h=450&fit=crop" },
    { id: 3, image: "https://images.unsplash.com/photo-1574267432553-4b4628081c31?w=300&h=450&fit=crop" },
    { id: 4, image: "https://images.unsplash.com/photo-1626814026160-2237a95fc5a0?w=300&h=450&fit=crop" },
    { id: 5, image: "https://images.unsplash.com/photo-1616530940355-351fabd9524b?w=300&h=450&fit=crop" },
    { id: 6, image: "https://images.unsplash.com/photo-1509281373149-e957c6296406?w=300&h=450&fit=crop" }
  ];

  return (
    <div className="mt-4 space-y-8">
      <div className="space-y-4">
        <h2 className="text-2xl font-semibold text-white">{title}</h2>
        <div className="grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 lg:grid-cols-6 gap-2">
          {movies.map((movie) => (
            <div 
              key={movie.id} 
              className="relative group aspect-[2/3] overflow-hidden rounded-md cursor-pointer transition duration-200 ease-in transform hover:scale-105"
            >
              <img
                src={movie.image}
                alt={`Movie ${movie.id}`}
                className="w-full h-full object-cover"
              />
              <div className="absolute inset-0 bg-black bg-opacity-0 group-hover:bg-opacity-50 transition-all duration-200" />
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}

export default MovieRow;