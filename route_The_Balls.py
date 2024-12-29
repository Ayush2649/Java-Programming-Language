def route_the_balls(ball_sequence, bucket_paths):
    openings = 0
    current_path = None
    
    # Process each ball in the sequence.
    for ball in ball_sequence:
        # Find the target path for this ball
        target_path = bucket_paths[ball]
        
        # If the path has changed, increment the opening count
        if target_path != current_path:
            openings += 1
            current_path = target_path
    
    return openings

def main():
    ball_sequence = ['B', 'Y', 'B', 'R'] 
    bucket_paths = {'B': 'blue_path', 'Y': 'yellow_path', 'R': 'red_path'}
    
    result = route_the_balls(ball_sequence, bucket_paths)

    print(f"Total number of junction openings: {result}")

if __name__ == "__main__":
    main()
