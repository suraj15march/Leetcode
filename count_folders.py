import os

def count_folders(path='.'):
    folder_count = 0
    for root, dirs, files in os.walk(path):
        folder_count += len(dirs)
    return folder_count

folder_count = count_folders()

# Read the current README
with open('README.md', 'r') as file:
    readme_contents = file.readlines()

# Find the line to update
for i, line in enumerate(readme_contents):
    if line.startswith('Total number of folders:'):
        readme_contents[i] = f'Total number of folders: {folder_count}\n'
        break
else:
    readme_contents.append(f'Total number of folders: {folder_count}\n')

# Write the updated README
with open('README.md', 'w') as file:
    file.writelines(readme_contents)
